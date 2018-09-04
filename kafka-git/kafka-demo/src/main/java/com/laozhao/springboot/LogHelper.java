package com.laozhao.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import java.text.MessageFormat;

/**
 * Created by viruser on 2018/9/4.
 */
public class LogHelper {
    private static  final Logger log= LogManager.getLogger(LogHelper.class);
    private static  final Marker platMaker= MarkerManager.getMarker("PLAT");

    public static  void  logRecord(String logId,String msg){
     String platPattern="[RECORD][{0}][{1}]";
     String  logMsg= MessageFormat.format(platPattern,logId,msg);
     log.info(platMaker,logMsg);
    }
}
