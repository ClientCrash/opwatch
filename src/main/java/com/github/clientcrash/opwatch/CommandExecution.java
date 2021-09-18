package com.github.clientcrash.opwatch;


import java.util.Date;

public class CommandExecution {
    public CommandExecution(String author,String UUID,String Command){
        this.author=author;
        this.UUID=UUID;
        this.Command=Command;
    }
    public String author;
    public String UUID;
    public String Command;
    public Date time = new Date(0);
}
