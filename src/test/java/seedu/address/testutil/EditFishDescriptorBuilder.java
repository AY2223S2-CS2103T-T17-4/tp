package seedu.address.testutil;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import seedu.address.logic.commands.EditCommand.EditFishDescriptor;
import seedu.address.model.fish.Address;
import seedu.address.model.fish.Email;
import seedu.address.model.fish.Fish;
import seedu.address.model.fish.Name;
import seedu.address.model.fish.Phone;
import seedu.address.model.tag.Tag;

/**
 * A utility class to help with building EditFishDescriptor objects.
 */
public class EditFishDescriptorBuilder {

    private EditFishDescriptor descriptor;

    public EditFishDescriptorBuilder() {
        descriptor = new EditFishDescriptor();
    }

    public EditFishDescriptorBuilder(EditFishDescriptor descriptor) {
        this.descriptor = new EditFishDescriptor(descriptor);
    }

    /**
     * Returns an {@code EditFishDescriptor} with fields containing {@code fish}'s details
     */
    public EditFishDescriptorBuilder(Fish fish) {
        descriptor = new EditFishDescriptor();
        descriptor.setName(fish.getName());
        descriptor.setPhone(fish.getPhone());
        descriptor.setEmail(fish.getEmail());
        descriptor.setAddress(fish.getAddress());
        descriptor.setTags(fish.getTags());
    }

    /**
     * Sets the {@code Name} of the {@code EditFishDescriptor} that we are building.
     */
    public EditFishDescriptorBuilder withName(String name) {
        descriptor.setName(new Name(name));
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code EditFishDescriptor} that we are building.
     */
    public EditFishDescriptorBuilder withPhone(String phone) {
        descriptor.setPhone(new Phone(phone));
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code EditFishDescriptor} that we are building.
     */
    public EditFishDescriptorBuilder withEmail(String email) {
        descriptor.setEmail(new Email(email));
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code EditFishDescriptor} that we are building.
     */
    public EditFishDescriptorBuilder withAddress(String address) {
        descriptor.setAddress(new Address(address));
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code EditFishDescriptor}
     * that we are building.
     */
    public EditFishDescriptorBuilder withTags(String... tags) {
        Set<Tag> tagSet = Stream.of(tags).map(Tag::new).collect(Collectors.toSet());
        descriptor.setTags(tagSet);
        return this;
    }

    public EditFishDescriptor build() {
        return descriptor;
    }
}