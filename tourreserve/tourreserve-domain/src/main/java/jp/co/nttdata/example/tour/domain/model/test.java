package jp.co.nttdata.example.tour.domain.model;

import java.util.Date;

import org.joda.time.DateTime;

public class test {


	public static void main(String[] args) {
		DateTime depDayDateTime=new DateTime(new Date());

		System.out.println(depDayDateTime.minusDays(7));;


	}
}
