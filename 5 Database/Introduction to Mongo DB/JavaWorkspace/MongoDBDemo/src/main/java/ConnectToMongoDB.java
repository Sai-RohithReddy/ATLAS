import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;
import org.bson.json.JsonWriterSettings;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;

public class ConnectToMongoDB {

	public static void main(String[] args) {
		try (MongoClient mongoClient = new MongoClient("localhost", 27017)) {

//			Dropping the database
			mongoClient.dropDatabase("order");
//			database.drop();

//			Creating Database
			MongoDatabase database = mongoClient.getDatabase("order");

//			Creating Collection
			database.createCollection("product");

//			Listing all the databases
			MongoCursor<String> dbsCursor = mongoClient.listDatabaseNames().iterator();
			while (dbsCursor.hasNext()) {
				System.out.println(dbsCursor.next());
			}

//			InsertOneDocument
			MongoCollection<Document> productCollection = database.getCollection("product");
			Document iphoneDocument = new Document("productName", "IPhone").append("description", "IPhone14")
					.append("price", 70000).append("color", "white");

			productCollection.insertOne(iphoneDocument);

//			InsertManyDocument
			Document samsungTVDocument = new Document("productName", "Samsung LED TV")
					.append("description", "b5 inch LED TV").append("price", 120000).append("Support OTT", "Yes");

			Document alexaDocument = new Document("productName", "Alexa").append("description", "Can Speak")
					.append("price", 5000).append("Support Music", "Yes");

			List<Document> documentList = new ArrayList<>();
			documentList.add(samsungTVDocument);
			documentList.add(alexaDocument);

			productCollection.insertMany(documentList);

//			Listing all the Documents in Collection
			FindIterable<Document> findIterable = productCollection.find();
			Iterator<Document> iterator = findIterable.iterator();
			while (iterator.hasNext()) {
				Document document = (Document) iterator.next();
				System.out.println(document);
				System.out.println("Product Name: " + document.get("productName"));
			}

//			Updating One value in Collection
			productCollection.updateOne(Filters.eq("productName", "IPhone"), Updates.set("price", 900000));

//			Updating Many values in Collection
			productCollection.updateMany(Filters.eq("Support Music", "Yes"), Updates.set("Category", "Smart Product"));

//			Read specific document
			Document first = productCollection.find(new Document("productName", "IPhone")).first();
			System.out.println("Filtered Document is: " + first);

//			Read a range of documents
			FindIterable<Document> find = productCollection.find(Filters.gte("price", 10000));
			Iterator<Document> findIterator = find.iterator();
			while (findIterator.hasNext()) {
				System.out.println(findIterator.next().toJson());
			}

//			Adding the document into ArrayList and reading them
			List<Document> productList = productCollection.find().into(new ArrayList<Document>());
			for (Document productDocument : productList) {
				System.out.println(productDocument.toJson());
			}

//			Deleting one document in collection
//			DeleteResult deleteOne = productCollection.deleteOne(Filters.eq("productName", "Alexa"));
//			System.out.println("Number of documents deleted are: " + deleteOne.getDeletedCount());

//			FindOneAndDelete
			Document findOneAndDelete = productCollection.findOneAndDelete(Filters.eq("productName", "Alexa"));
			System.out.println(findOneAndDelete.toJson(JsonWriterSettings.builder().indent(true).build()));

//			Deleting multiple document in collection
			DeleteResult deleteMany = productCollection.deleteMany(Filters.gte("price", 10000));
			System.out.println("Number of document deleted are: " + deleteMany.getDeletedCount());

//			Listing collections in database
			MongoDatabase mydbDatabase = mongoClient.getDatabase("mydb");
			MongoCursor<String> iterator2 = mydbDatabase.listCollectionNames().iterator();
			while (iterator2.hasNext()) {
				System.out.println(iterator2.next());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
