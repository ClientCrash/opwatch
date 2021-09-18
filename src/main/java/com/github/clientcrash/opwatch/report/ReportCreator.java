package com.github.clientcrash.opwatch.report;

import com.github.clientcrash.opwatch.CommandExecution;
import com.github.clientcrash.opwatch.Opwatch;
import com.github.clientcrash.opwatch.util.CommandExecutionListUtils;

import java.awt.*;
import java.util.ArrayList;

public class ReportCreator {



    public static ArrayList<String> createPlayerReport(String uuid){

        ArrayList<CommandExecution> entrys =  CommandExecutionListUtils.getExecutionsByPlayer(Opwatch.cmsStore.cmds,uuid);
        ArrayList<String> report = generateReportFromExecutions(entrys);


        return report;
    }
    public static ArrayList<String> createFullReport(){
        ArrayList<String> report = new ArrayList<String>();
        ArrayList<CommandExecution> elements = Opwatch.cmsStore.cmds;
        for(CommandExecution e : elements){
            report.add("§e" + e.time.toString() + " " + e.author + " >> " + e.Command);
        }
        return report;
    }
    private static ArrayList<String> generateReportFromExecutions(ArrayList<CommandExecution> execs){
        ArrayList<String> report =  new ArrayList<>();
        for(CommandExecution e : execs){
            report.add("§e" + e.time.toString() + " " + e.author + " >> " + e.Command);
        }
        return report;
    }



}
