package service.impl;

import config.ConferenceFactory;
import model.entities.Conference;
import model.repository.ConferenceDB;
import service.InputService;
import view.View;

import java.util.Scanner;

import static view.MessageConstants.*;

public class InputServiceImpl implements InputService {
    private View view;
    private Scanner scanner;

    public InputServiceImpl(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    @Override
    public Conference makeConferenceByChoice() {
        Conference conference = null;
        boolean isRun = true;
        int choice;

        while (isRun) {
            view.printMessages(
                    INPUT_MAKE,
                    INPUT1_JAVA_DAY_KYIV,
                    INPUT2_JAVA_DAY_LVIV,
                    INPUT3_JAVA_DAY_ODESA,
                    INPUT0_FINISH);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                view.printMessage(INPUT_WRONG_CHOICE); continue;
            }
            switch (choice) {
                case 1:
                    conference = ConferenceFactory.getConference(ConferenceDB.JAVA_DAY_KYIV_2019); break;
                case 2:
                    conference = ConferenceFactory.getConference(ConferenceDB.JAVA_DAY_LVIV_2019); break;
                case 3:
                    conference = ConferenceFactory.getConference(ConferenceDB.JAVA_DAY_ODESA_2019); break;
                case 0: break;
                default:
                    view.printMessage(INPUT_WRONG_CHOICE); continue;
            }
            isRun = false;
        }
        return conference;
    }
}
