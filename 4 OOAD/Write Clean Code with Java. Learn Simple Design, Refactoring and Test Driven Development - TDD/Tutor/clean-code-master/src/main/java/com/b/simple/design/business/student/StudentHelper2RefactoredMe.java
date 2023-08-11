package com.b.simple.design.business.student;

public class StudentHelper2RefactoredMe {

	private static final int QUIZ_LOWER_LIMIT = 20;
	private static final int EXTRA_FOR_MATHS_GRADE = 5;
	private static final int GRADE_A_LOWER_LIMIT = 91;
	private static final int EXTRA_FOR_MATHS = 10;
	private static final int GRADE_B_UPPER_LIMIT = 80;
	private static final int GRADE_B_LOWER_LIMIT = 51;

	/* PROBLEM 1 */
	/*
	 * You get a grade B if marks are between 51 and 80 (both inclusive). Except for
	 * Maths where the upper limit is increased by 10.
	 */
	public boolean isGradeB(int marks, boolean isMaths) {

		int extraLimit = isMaths ? GRADE_B_UPPER_LIMIT + EXTRA_FOR_MATHS : 0;

		int upperLimit = GRADE_B_UPPER_LIMIT + extraLimit;

		return marks >= GRADE_B_LOWER_LIMIT && marks <= upperLimit;
	}

	/* PROBLEM 2 */
	/*
	 * You are awarded a grade based on your marks. Grade A = 91 to 100, Grade B =
	 * 51 to 90, Otherwise Grade C Except for Maths where marks to get a Grade are 5
	 * higher than required for other subjects.
	 */

	public String getGrade(int mark, boolean isMaths) {
		
		int extraLimitForMaths = isMaths ? EXTRA_FOR_MATHS_GRADE : 0;
		
		if (mark >= GRADE_A_LOWER_LIMIT + extraLimitForMaths)
			return "A";
		
		if (mark >= GRADE_B_LOWER_LIMIT + extraLimitForMaths && mark < GRADE_A_LOWER_LIMIT) 
			return "B";
		
		return "C";
	}


	/*
	 * PROBLEM 3 You and your Friend are planning to enter a Subject Quiz. However,
	 * there is a marks requirement that you should attain to qualify.
	 * 
	 * Return value can be YES, NO or MAYBE.
	 * 
	 * YES If either of you are very good at the subject(has 80 or more marks)
	 * However, there is an exception that if either of you is not good in the
	 * subject(20 or less marks), it is NO. In all other conditions, return MAYBE.
	 * 
	 * However, the definition for good and not good are 5 marks higher if the
	 * subject is Mathematics.
	 * 
	 * marks1 - your marks marks2 - your friends marks
	 */

	public String willQualifyForQuiz(int marks1, int marks2, boolean isMaths) {
		if (isNotGood(marks1, isMaths) || isNotGood(marks2, isMaths))
			return "NO";
		if (isGood(marks1, isMaths) || isGood(marks2, isMaths))
			return "YES";
		return "MAYBE";
	}

	private boolean isGood(int marks, boolean isMaths) {
		int extraLimit = isMaths ? EXTRA_FOR_MATHS_GRADE : 0;
		return marks >= GRADE_B_UPPER_LIMIT + extraLimit;
	}

	private boolean isNotGood(int marks, boolean isMaths) {
		int extraLimit = isMaths ? EXTRA_FOR_MATHS_GRADE : 0;
		return marks <= QUIZ_LOWER_LIMIT + extraLimit;
	}

}