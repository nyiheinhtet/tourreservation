package jp.co.nttdata.example.tour.app.tourinfo;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.inject.Inject;

import org.joda.time.DateTime;
import org.springframework.stereotype.Component;
import org.terasoluna.gfw.common.codelist.AbstractCodeList;
import org.terasoluna.gfw.common.date.jodatime.JodaTimeDateFactory;

@Component("CL_DEPYEAR")
public class DepYearCodeList extends AbstractCodeList{

	@Inject
	JodaTimeDateFactory dateFactory;

	@Override
	public Map<String, String> asMap() {
		DateTime dateTime=dateFactory.newDateTime();
		DateTime nextYearDateTime=dateTime.plusYears(1);

		Map<String, String> depYearMap=new LinkedHashMap<String,String>();

		String thisYear=dateTime.toString("Y");
		String nextYear=nextYearDateTime.toString("Y");
		depYearMap.put(thisYear, thisYear);
		depYearMap.put(nextYear, nextYear);

		return Collections.unmodifiableMap(depYearMap);
	}

}
