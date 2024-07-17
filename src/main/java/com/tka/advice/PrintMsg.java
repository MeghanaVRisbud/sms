package com.tka.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintMsg {
	@Before("execution(* com.tka.service.PlayerService.getPlayers())")
public void printMessage()
{
	System.err.println("Hello");
}
}
