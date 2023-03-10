package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.fish.Fish;

/**
 * A utility class containing a list of {@code Fish} objects to be used in tests.
 */
public class TypicalFishes {

    public static final Fish ALICE = new FishBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253")
            .withTags("friends").build();
    public static final Fish BENSON = new FishBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withEmail("johnd@example.com").withPhone("98765432")
            .withTags("owesMoney", "friends").build();
    public static final Fish CARL = new FishBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withAddress("wall street").build();
    public static final Fish DANIEL = new FishBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withAddress("10th street").withTags("friends").build();
    public static final Fish ELLE = new FishBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").withAddress("michegan ave").build();
    public static final Fish FIONA = new FishBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").withAddress("little tokyo").build();
    public static final Fish GEORGE = new FishBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").withAddress("4th street").build();

    // Manually added
    public static final Fish HOON = new FishBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withAddress("little india").build();
    public static final Fish IDA = new FishBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withAddress("chicago ave").build();

    // Manually added - Fish's details found in {@code CommandTestUtil}
    public static final Fish AMY = new FishBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Fish BOB = new FishBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalFishes() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical Fishes.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Fish fish : getTypicalFishes()) {
            ab.addFish(fish);
        }
        return ab;
    }

    public static List<Fish> getTypicalFishes() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}