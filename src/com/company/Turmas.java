package com.company;

public class Turmas {

    private int id_turmas;
    private Salas sala;
    private int totalAlunos;

    public Turmas(int id_turmas, Salas sala, int totalAlunos) {
        this.id_turmas = id_turmas;
        this.sala = sala;
        this.totalAlunos = totalAlunos;
    }

    public void dadosTurma(){
        System.out.println("\n--------- Dados da turma" + id_turmas + "--------\n");
        System.out.println("ID turma: " + this.getId_turmas());
        System.out.println("Sala: " + this.getSala());
        System.out.println("Total de alunos: " + this.getTotalAlunos());
    }

    public int getId_turmas() {
        return id_turmas;
    }

    public void setId_turmas(int id_turmas) {
        this.id_turmas = id_turmas;
    }

    public Salas getSala() {
        return sala;
    }

    public void setSala(Salas sala) {
        this.sala = sala;
    }

    public int getTotalAlunos() {
        return totalAlunos;
    }

    public void setTotalAlunos(int totalAlunos) {
        this.totalAlunos = totalAlunos;
    }
}
