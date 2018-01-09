package com.stackroute.activitystream.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* Each of the methods of RestControllers has to be used in the given code snippet, any particular method will have all the four aspectJ annotation(@Before, @After, @AfterReturning, @AfterThrowing). 
Note: Provided is a sample using a single method, similarly you need to write for all the methods of RestControllers.*/

@Aspect
public class LoggingAspect {
	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution(* com.stackroute.activitystream.controller.UserAuthController.authenticate(..))")
	public void logBeforeAuthenticate(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserAuthController.authenticate(..))")
	public void logAfterAuthenticate(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserAuthController.authenticate(..))", returning = "result")
	public void logAfterReturningAuthenticate(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserAuthController.authenticate(..))", throwing = "error")
	public void logAfterThrowingAuthenticate(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.UserAuthController.logout(..))")
	public void logBeforeLogout(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserAuthController.logout(..))")
	public void logAfterLogout(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserAuthController.logout(..))", returning = "result")
	public void logAfterReturningLogout(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserAuthController.logout(..))", throwing = "error")
	public void logAfterThrowingLogout(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.UserController.getAllUser(..))")
	public void logBeforeGetAllUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserController.getAllUser(..))")
	public void logAfterGetAllUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.getAllUser(..))", returning = "result")
	public void logAfterReturningGetAllUser(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.getAllUser(..))", throwing = "error")
	public void logAfterThrowingGetAllUser(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.UserController.getUser(..))")
	public void logBeforeGetUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserController.getUser(..))")
	public void logAfterGetUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.getUser(..))", returning = "result")
	public void logAfterReturningGetUser(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.getUser(..))", throwing = "error")
	public void logAfterThrowingGetUser(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.UserController.createUser(..))")
	public void logBeforeCreateUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserController.createUser(..))")
	public void logAfterCreateUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.createUser(..))", returning = "result")
	public void logAfterReturningCreateUser(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.createUser(..))", throwing = "error")
	public void logAfterThrowingCreateUser(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.UserController.updateUser(..))")
	public void logBeforeUpdateUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserController.updateUser(..))")
	public void logAfterUpdateUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.updateUser(..))", returning = "result")
	public void logAfterReturningUpdateUser(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserController.updateUser(..))", throwing = "error")
	public void logAfterThrowingUpdateUser(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.CircleController.createCircle(..))")
	public void logBeforeCreateCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.CircleController.createCircle(..))")
	public void logAfterCreateCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.CircleController.createCircle(..))", returning = "result")
	public void logAfterReturningCreateCircle(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.CircleController.createCircle(..))", throwing = "error")
	public void logAfterThrowingCreateCircle(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.CircleController.getAllCircles(..))")
	public void logBeforeGetAllCircles(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.CircleController.getAllCircles(..))")
	public void logAfterGetAllCircles(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.CircleController.getAllCircles(..))", returning = "result")
	public void logAfterReturningGetAllCircles(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.CircleController.getAllCircles(..))", throwing = "error")
	public void logAfterThrowingGetAllCircles(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.CircleController.searchCircle(..))")
	public void logBeforeSearchCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.CircleController.searchCircle(..))")
	public void logAfterSearchCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.CircleController.searchCircle(..))", returning = "result")
	public void logAfterReturningSearchCircle(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.CircleController.searchCircle(..))", throwing = "error")
	public void logAfterThrowingSearchCircle(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToCircle(..))")
	public void logBeforeSendMessageToCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToCircle(..))")
	public void logAfterSendMessageToCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToCircle(..))", returning = "result")
	public void logAfterReturningSendMessageToCircle(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToCircle(..))", throwing = "error")
	public void logAfterThrowingSendMessageToCircle(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToUser(..))")
	public void logBeforeSendMessageToUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToUser(..))")
	public void logAfterSendMessageToUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToUser(..))", returning = "result")
	public void logAfterReturningSendMessageToUser(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.sendMessageToUser(..))", throwing = "error")
	public void logAfterThrowingSendMessageToUser(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.MessageController.getMessageByUser(..))")
	public void logBeforeGetMessageByUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.getMessageByUser(..))")
	public void logAfterGetMessageByUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.getMessageByUser(..))", returning = "result")
	public void logAfterReturningGetMessageByUser(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.getMessageByUser(..))", throwing = "error")
	public void logAfterThrowingGetMessageByUser(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.MessageController.getMessagesByCircle(..))")
	public void logBeforeGetMessagesByCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.getMessagesByCircle(..))")
	public void logAfterGetMessagesByCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.getMessagesByCircle(..))", returning = "result")
	public void logAfterReturningGetMessagesByCircle(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.getMessagesByCircle(..))", throwing = "error")
	public void logAfterThrowingGetMessagesByCircle(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.MessageController.listAllTags(..))")
	public void logBeforeListAllTags(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.listAllTags(..))")
	public void logAfterListAllTags(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.listAllTags(..))", returning = "result")
	public void logAfterReturningListAllTags(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.listAllTags(..))", throwing = "error")
	public void logAfterThrowingListAllTags(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.MessageController.showMessagesWithTag(..))")
	public void logBeforeShowMessagesWithTag(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.showMessagesWithTag(..))")
	public void logAfterShowMessagesWithTag(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.showMessagesWithTag(..))", returning = "result")
	public void logAfterReturningShowMessagesWithTag(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.showMessagesWithTag(..))", throwing = "error")
	public void logAfterThrowingShowMessagesWithTag(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.MessageController.subscribeTag(..))")
	public void logBeforeSubscribeTag(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.subscribeTag(..))")
	public void logAfterSubscribeTag(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.subscribeTag(..))", returning = "result")
	public void logAfterReturningSubscribeTag(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.subscribeTag(..))", throwing = "error")
	public void logAfterThrowingSubscribeTag(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.MessageController.unsubscribeTag(..))")
	public void logBeforeUnsubscribeTag(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.unsubscribeTag(..))")
	public void logAfterUnsubscribeTag(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.unsubscribeTag(..))", returning = "result")
	public void logAfterReturningUnsubscribeTag(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.unsubscribeTag(..))", throwing = "error")
	public void logAfterThrowingUnsubscribeTag(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.MessageController.searchUserTag(..))")
	public void logBeforeSearchUserTag(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.MessageController.searchUserTag(..))")
	public void logAfterSearchUserTag(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.searchUserTag(..))", returning = "result")
	public void logAfterReturningSearchUserTag(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.MessageController.searchUserTag(..))", throwing = "error")
	public void logAfterThrowingSearchUserTag(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.UserCircleController.addUser(..))")
	public void logBeforeAddUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserCircleController.addUser(..))")
	public void logAfterAddUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserCircleController.addUser(..))", returning = "result")
	public void logAfterReturningAddUser(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserCircleController.addUser(..))", throwing = "error")
	public void logAfterThrowingAddUser(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.UserCircleController.removeUser(..))")
	public void logBeforeRemoveUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserCircleController.removeUser(..))")
	public void logAfterRemoveUser(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserCircleController.removeUser(..))", returning = "result")
	public void logAfterReturningRemoveUser(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserCircleController.removeUser(..))", throwing = "error")
	public void logAfterThrowingRemoveUser(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

	@Before("execution(* com.stackroute.activitystream.controller.UserCircleController.getAllCircle(..))")
	public void logBeforeGetAllCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.stackroute.activitystream.controller.UserCircleController.getAllCircle(..))")
	public void logAfterGetAllCircle(JoinPoint joinPoint) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.controller.UserCircleController.getAllCircle(..))", returning = "result")
	public void logAfterReturningGetAllCircle(JoinPoint joinPoint, Object result) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.controller.UserCircleController.getAllCircle(..))", throwing = "error")
	public void logAfterThrowingGetAllCircle(JoinPoint joinPoint, Throwable error) {
		logger.debug("Method Name : " + joinPoint.getSignature().getName());
		logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.debug("Exception : " + error);
	}

}