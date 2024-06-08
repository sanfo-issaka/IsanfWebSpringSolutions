package com.isanf.IsanfWebCRUDSolutions.repository.dao;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.isanf.IsanfWebCRUDSolutions.domain.entity.UserOld;

//R 1
@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return UserOld.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
    	UserOld user = (UserOld) target;

        // Validation du nom
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nom", "NotEmpty");
        if (user.getNom().length() < 2 || user.getNom().length() > 50) {
            errors.rejectValue("nom", "Size.user.nom");
        }

        // Validation de l'email
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty");
        if (!user.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            errors.rejectValue("email", "Pattern.user.email");
        }
    }
}
