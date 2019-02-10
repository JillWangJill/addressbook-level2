package seedu.addressbook.commands;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.util.TypicalPersons;

public class SortCommandTest {
    private final AddressBook addressBook = new TypicalPersons().getTypicalAddressBook();
    private final TypicalPersons td = new TypicalPersons();
    @Test
    public void execute() throws IllegalValueException {
        SortCommand command = createSortCommand(new String[]{"Candy","Amy", "Destiny","Bill"};
        CommandResult result = command.execute();
        assertEquals(Command.getMessageForPersonListShownSummary(Arrays.asList(td.amy, td.bill, td.candy)), result.feedbackToUser);
    }


    private SortCommand createSortCommand(String[] keywords) {
        final Set<String> keywordSet = new HashSet<>(Arrays.asList(keywords));
        SortCommand command = new SortCommand(keywordSet);
        command.setData(addressBook, Collections.emptyList());
        return command;
    }

}




