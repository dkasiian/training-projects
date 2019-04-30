package com.company;

class StartCommand implements Command {
    private Computer computer;

    StartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}
