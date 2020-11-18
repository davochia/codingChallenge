package com.example.classes;

public class Subject {
    private String subjectCode;
    private String subjectName;

    public Subject(String subjectCode, String subjectName) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    /**
     * Copy the Subject attributes to a new method
     * @param subject new method created from the copied method
     */
    public Subject(Subject subject){
        this.subjectCode = subject.subjectCode;
        this.subjectName = subject.subjectName;
    }

    /**
     * Compare the copied object (subject) with the parent subject (this)
     * @param object the copied object to be compared
     * @return will return true or false if both are same or not
     */
    public boolean equals(Subject object){
        if(this.subjectName.equals(object.subjectName) &&
            this.subjectCode.equals(object.subjectCode)){
            return true;
        }else{
            return false;
        }
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject details = " +
                "Subject Code: " + subjectCode + ", " +
                "Subject Name: " + subjectName;
    }
}
