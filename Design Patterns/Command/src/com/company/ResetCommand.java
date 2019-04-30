package com.company;

class ResetCommand implements Command {
    private Computer computer;

    ResetCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}
