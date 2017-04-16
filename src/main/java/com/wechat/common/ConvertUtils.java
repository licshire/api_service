package com.wechat.common;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertUtils {
	public static String getStatus(String tsm1){
		if(tsm1.equals("13001"))
			return "无效";
		else if(tsm1.equals("13002"))
			return "未审核";
		else if(tsm1.equals("13003"))
			return "已审核，未受理";
		else if(tsm1.equals("13004"))
			return "已受理，未批复";
		else if(tsm1.equals("13005"))
			 return "已批复，未派发";
		else if(tsm1.equals("13006"))
			return "已派发，未办理";
		else if(tsm1.equals("13007"))
			return "办理中，未办结";
		else if(tsm1.equals("13008"))
			return "已办结";
		else if(tsm1.equals("13031"))
			return "审核未通过";
		else if(tsm1.equals("13032"))
			 return "通过审核";
		else
			return "参数错误";
	}
	public static String getDateStr(Timestamp date){
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date); 
	}
	public static String getDateStr(){
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date()); 
	}
	public static Timestamp getDateTimestamp(String dateStr) throws ParseException{
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Timestamp ts = new Timestamp(format.parse(dateStr).getTime());
		//Timestamp ts=Timestamp.valueOf(dateStr);
		return ts;
	}

}
