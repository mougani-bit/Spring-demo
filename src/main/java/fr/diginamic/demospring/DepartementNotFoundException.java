package fr.diginamic.demospring;
public class DepartementNotFoundException extends RuntimeException {

    public DepartementNotFoundException() {
        super();
    }

    public DepartementNotFoundException(String message) {
        super(message);
    }
}

