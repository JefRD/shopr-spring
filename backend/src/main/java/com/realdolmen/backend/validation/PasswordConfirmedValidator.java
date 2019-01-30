package com.realdolmen.backend.validation;

import com.realdolmen.backend.dto.UserDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConfirmedValidator implements ConstraintValidator<PasswordConfirmed, Object>{

    @Override
    public boolean isValid(Object user, ConstraintValidatorContext context) {
        String password = ((UserDto)user).getPassword();
        String confirmedPassword = ((UserDto)user).getConfirmPassword();
        return password.equals(confirmedPassword);
    }

}
