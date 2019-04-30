package com.company;

class StopCommand implements Command {
    private Computer computer;

    StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
