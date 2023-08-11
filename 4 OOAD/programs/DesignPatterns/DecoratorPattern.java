package DesignPatterns;

//decorator pattern
interface Text {
    String format();
}

class PlainText implements Text {
    String text;

    PlainText(String text) {
        this.text = text;
    }

    public String format() {
        return text;
    }
}

abstract class TextDecorator implements Text {
    Text decoratedText;

    TextDecorator(Text text) {
        this.decoratedText = text;
    }

    public String format() {
        return decoratedText.format();
    }
}

class BoldTextDecorator extends TextDecorator {
    BoldTextDecorator(Text text) {
        super(text);
    }

    public String format() {
        return "<b>" + super.format() + "</b>";
    }
}

class ItalicTextDecorator extends TextDecorator {
    ItalicTextDecorator(Text text) {
        super(text);
    }

    public String format() {
        return "<i>" + super.format() + "</i>";
    }
}

public class DecoratorPattern {
    public static void main(String args[]) {
        Text text = new PlainText("Hello, World!!");
        Text boldText = new BoldTextDecorator(text);
        System.out.println(text.format());
        System.out.println(boldText.format());
    }
}
