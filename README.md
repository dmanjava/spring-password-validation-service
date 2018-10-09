# spring-password-validation-service

I was not able to get this completely finished yet. But it should give you an idea
of where I was going with it.

TODO’s 
 - Finish wiring beans and services and add web service endpoints
 - Add tests.

(Here are some links relative to the root of the project)
You can find…

 Basic use cases 
    at “project root”/models/PasswordValidationUseCase.png

 Code - src/main/java

 Main entry point com.whitaker.PasswordValidationServicesApplication

 Project Class/Models Interfaces and implementations in package com.whitaker.models
	
	DuplicateChecker.java	IDuplicateChecker.java	IPassword.java	IPasswordPattern.java	IPasswordValidationResult.java	Password.java	PasswordErrorType.java	PasswordPattern.java	PasswordValidationException.java	PasswordValidationResult.java

 Project Service Interfaces and implementations in package com.whitaker.service

	CharacterValidationService.java	ICharacterValidationService.java	ILengthValidationService.java	IPasswordValidationService.java	IValidationService.java		LengthValidationService.java	PasswordValidationService.java	ValidationService.java