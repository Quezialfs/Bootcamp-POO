package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main (String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria("8hs");
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria("4hs");
		
		Mentoria mentoria = new Mentoria ();
		mentoria.setTitulo("mentoria");
		mentoria.setDescricao("descriçao");
		mentoria.setData(LocalDate.now());		
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devQuezia = new Dev();
		devQuezia.setNome("Quezia");
		devQuezia.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Quezia:" + devQuezia.getConteudosInscritos());
		devQuezia.progredir();		
		System.out.println("-");
		System.out.println("Conteudos Inscritos Quezia:" + devQuezia.getConteudosInscritos());
		System.out.println("Conteudos Concluídos Quezia:" + devQuezia.getConteudosConcluidos());
		System.out.println("XP:" + devQuezia.calcularTotalXp());
		
		System.out.println("-----------------");
		
		Dev devAna = new Dev();
		devAna.setNome("Ana");	
		devAna.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Ana:" + devAna.getConteudosInscritos());
		devAna.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Ana:" + devAna.getConteudosInscritos());
		System.out.println("Conteudos Concluídos Ana:" + devAna.getConteudosConcluidos());
		System.out.println("XP:" + devAna.calcularTotalXp());
		
	}
	
}
