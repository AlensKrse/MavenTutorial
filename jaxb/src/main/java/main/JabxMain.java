package main;

import org.apache.commons.lang3.StringUtils;
import org.example.jaxb.CreateProductRequest;

public class JabxMain {

    public static void main(String[] args) {
        CreateProductRequest request = new CreateProductRequest();
        System.out.println(request);
        final boolean blank = StringUtils.isBlank(request.getApikey());
    }
}
