package com.github.clientcrash.opwatch.util;

import com.github.clientcrash.opwatch.CommandExecution;

import java.util.ArrayList;

public class CommandExecutionListUtils {
    public static ArrayList<CommandExecution> getExecutionsByPlayer(ArrayList<CommandExecution> list,String uuid){

        ArrayList<CommandExecution> plist= new ArrayList<CommandExecution>();
        for(CommandExecution e : list){
            if(e.UUID==uuid){plist.add(e);}
        }
        return plist;
    }
}
