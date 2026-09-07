package hw_5_oop_principles_in_java.task_2_pet_management;

public class PetManager {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void handlePet(Pet pet) {
        if (this.pet instanceof Feedable) {
            Feedable feedablePet = (Feedable) this.pet;
            feedablePet.feed();
        }

        if (this.pet instanceof Interactable) {
            Interactable interactablePet = (Interactable) this.pet;
            interactablePet.interact();
        }
    }
}
