package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// calculosComDataHora
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		// varial uma semana antes
		// minus = subtração
		// plus = somar
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		

		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()); // calcula a duração entre datas / horas
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05); // calcula a duração entre datas / horas
		Duration t3 = Duration.between(pastWeekInstant,  d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		
		System.out.println("Duração t1 dias = " + t1.toDays());
		System.out.println("Duração t2 dias = " + t2.toDays());
		System.out.println("Duração t3 dias = " + t3.toDays());
		System.out.println("Duração t4 dias = " + t4.toDays());
	
		sc.close();
	}

}
