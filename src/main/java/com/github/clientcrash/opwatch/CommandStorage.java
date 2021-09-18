package com.github.clientcrash.opwatch;

import java.util.ArrayList;
import java.util.List;

public class CommandStorage {
    public ArrayList<CommandExecution> cmds;
    public CommandStorage(){
        cmds= new ArrayList<CommandExecution>();
    }
    public void addCommandExecution(CommandExecution e){cmds.add(e);}
    public void addCommand(String uuid, String name,String command){
        CommandExecution exec = new CommandExecution(name,uuid,command);
    }
}
