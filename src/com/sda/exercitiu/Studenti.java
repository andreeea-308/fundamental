package com.sda.exercitiu;

import java.time.LocalDate;
import java.time.Period;

public class Studenti {
    private String name;
    private LocalDate ziuaDeNastere;
    private String codStudent;
    private double[] noteStudent;
    public static int numberOfStudents = 0;



    public Studenti(String name, LocalDate ziuaDeNastere, String codStudent, double[] noteStudent) {
        this.name = name;
        this.ziuaDeNastere = ziuaDeNastere;
        this.codStudent = codStudent;
        this.noteStudent = noteStudent;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getZiuaDeNastere() {
        return ziuaDeNastere;
    }

    public void setZiuaDeNastere(LocalDate ziuaDeNastere) {
        this.ziuaDeNastere = ziuaDeNastere;
    }

    public String getCodStudent() {
        return codStudent;
    }

    public void setCodStudent(String codStudent) {
        this.codStudent = codStudent;
    }

    public double[] getNoteStudent() {
        return noteStudent;
    }

    public double[] setNoteStudent(double[] noteStudent) {
        this.noteStudent = noteStudent;
        return noteStudent;

    }
    public static int getNumberTotal(){
        return numberOfStudents;
    }
    public double medieNotePrimuSemestru(){
        double sum = 0;
        for (double nota :
        noteStudent){
            sum = sum + nota;
        }
        return (sum/noteStudent.length);
    }
    public Period varstaStudentului(){
        Period varsta = Period.between(ziuaDeNastere, LocalDate.now());
        return varsta;
    }


}


