package com.ead.authuser.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class UserNameConstraintImpl implements ConstraintValidator<UserNameConstraint,String> {
    @Override
    public void initialize(UserNameConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String userName, ConstraintValidatorContext constraintValidatorContext) {
        if(Objects.isNull(userName) || userName.trim().isEmpty() || userName.contains(" ")){
            return false;
        }
        return true;
    }
}
