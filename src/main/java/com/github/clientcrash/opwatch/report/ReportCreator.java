package com.github.clientcrash.opwatch.report;

import com.github.clientcrash.opwatch.CommandExecution;
import com.github.clientcrash.opwatch.Opwatch;
import com.github.clientcrash.opwatch.util.CommandExecutionListUtils;

import java.util.ArrayList;

public class ReportCreator {



    public static ArrayList<String> createPlayerReport(String uuid){

        ArrayList<CommandExecution> entrys =  CommandExecutionListUtils.getExecutionsByPlayer(Opwatch.cmsStore.cmds,uuid);
        ArrayList<String> report = generateReportFromExecutions(entrys);


        return report;
    }
    private static ArrayList<String> generateReportFromExecutions(ArrayList<CommandExecution> execs){
        ArrayList<String> report =  new ArrayList<String>();
        for(CommandExecution e : execs){
            report.add("§e" + e.time.toString() + " " + e.author + " >> " + e.Command);
        }
        return report;
    }



}
