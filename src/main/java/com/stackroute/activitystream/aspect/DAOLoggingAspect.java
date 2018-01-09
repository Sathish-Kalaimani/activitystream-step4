package com.stackroute.activitystream.aspect;
  /* Each of the methods of DAOImpls has to be used in the given code snippet, any particular method will have all the four aspectJ annotation(@Before, 
  @After, @AfterReturning, @AfterThrowing). Note: Provided is a sample using a single method, similarly you need to write for all the methods of 
  DAOImpls. */

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
 public class DAOLoggingAspect {

private static final Logger logger = LoggerFactory.getLogger(DAOLoggingAspect.class);

@Before("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.validate(..))")
public void logBeforeValidateUser(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}

@After("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.validate(..))")
public void logAfterValidateUser(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.validate(..))", returning = "result")
public void logAfterReturningValidateUser(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.validate(..))", throwing = "error")
public void logAfterThrowingValidateUser(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.save(..))")
public void logBeforeSave(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}

@After("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.save(..))")
public void logAfterSave(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.save(..))", returning = "result")
public void logAfterReturningSave(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.save(..))", throwing = "error")
public void logAfterThrowingSave(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.update(..))")
public void logBeforeUpdate(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}

@After("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.update(..))")
public void logAfterUpdate(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.update(..))", returning = "result")
public void logAfterReturningUpdate(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.update(..))", throwing = "error")
public void logAfterThrowingUpdate(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.delete(..))")
public void logBeforeDelete(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.delete(..))")
public void logAfterDelete(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.delete(..))", returning = "result")
public void logAfterReturningDelete(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.delete(..))", throwing = "error")
public void logAfterThrowingDelete(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.list(..))")
public void logBeforeList(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.list(..))")
public void logAfterList(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.list(..))", returning = "result")
public void logAfterReturningList(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.list(..))", throwing = "error")
public void logAfterThrowingList(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.get(..))")
public void logBeforeGet(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.get(..))")
public void logAfterGet(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.get(..))", returning = "result")
public void logAfterReturningGet(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.get(..))", throwing = "error")
public void logAfterThrowingGet(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.exists(..))")
public void logBeforeExists(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.exists(..))")
public void logAfterExists(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.exists(..))", returning = "result")
public void logAfterReturningExists(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserDAOImpl.exists(..))", throwing = "error")
public void logAfterThrowingExists(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.addUser(..))")
public void logBeforeAddUser(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.addUser(..))")
public void logAfterAddUser(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.addUser(..))", returning = "result")
public void logAfterReturningAddUser(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.addUser(..))", throwing = "error")
public void logAfterThrowingAddUser(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.removeUser(..))")
public void logBeforeRemoveUser(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.removeUser(..))")
public void logAfterRemoveUser(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.removeUser(..))", returning = "result")
public void logAfterReturningRemoveUser(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.removeUser(..))", throwing = "error")
public void logAfterThrowingRemoveUser(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

//UserCircle get(..) method
@Before("execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.get(..))")
public void logBeforeGetUserCircle(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.get(..))")
public void logAfterGetUserCircle(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.get(..))", returning = "result")
public void logAfterReturningGetUserCircle(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.get(..))", throwing = "error")
public void logAfterThrowingGetUserCircle(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.getMyCircles(..))")
public void logBeforeGetMyCircles(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.getMyCircles(..))")
public void logAfterGetMyCircles(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.getMyCircles(..))", returning = "result")
public void logAfterReturningGetMyCircles(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.UserCircleDAOImpl.getMyCircles(..))", throwing = "error")
public void logAfterThrowingGetMyCircles(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.getMessagesFromCircle(..))")
public void logBeforeGetMessagesFromCircle(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.getMessagesFromCircle(..))")
public void logAfterGetMessagesFromCircle(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.getMessagesFromCircle(..))", returning = "result")
public void logAfterReturningGetMessagesFromCircle(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.getMessagesFromCircle(..))", throwing = "error")
public void logAfterThrowingGetMessagesFromCircle(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.getMessagesFromUser(..))")
public void logBeforeGetMessagesFromUser(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.getMessagesFromUser(..))")
public void logAfterGetMessagesFromUser(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.getMessagesFromUser(..))", returning = "result")
public void logAfterReturningGetMessagesFromUser(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.getMessagesFromUser(..))", throwing = "error")
public void logAfterThrowingGetMessagesFromUser(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.getMessages(..))")
public void logBeforeGetMessages(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.getMessages(..))")
public void logAfterGetMessages(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.getMessages(..))", returning = "result")
public void logAfterReturningGetMessages(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.getMessages(..))", throwing = "error")
public void logAfterThrowingGetMessages(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.sendMessageToCircle(..))")
public void logBeforeSendMessageToCircle(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.sendMessageToCircle(..))")
public void logAfterSendMessageToCircle(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.sendMessageToCircle(..))", returning = "result")
public void logAfterReturningSendMessageToCircle(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.sendMessageToCircle(..))", throwing = "error")
public void logAfterThrowingSendMessageToCircle(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.sendMessageToUser(..))")
public void logBeforeSendMessageToUser(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.sendMessageToUser(..))")
public void logAfterSendMessageToUser(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.sendMessageToUser(..))", returning = "result")
public void logAfterReturningSendMessageToUser(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.sendMessageToUser(..))", throwing = "error")
public void logAfterThrowingSendMessageToUser(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.listTags(..))")
public void logBeforeListTags(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.listTags(..))")
public void logAfterListTags(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.listTags(..))", returning = "result")
public void logAfterReturningListTags(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.listTags(..))", throwing = "error")
public void logAfterThrowingListTags(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.listMyTags(..))")
public void logBeforeListMyTags(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.listMyTags(..))")
public void logAfterListMyTags(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.listMyTags(..))", returning = "result")
public void logAfterReturningListMyTags(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.listMyTags(..))", throwing = "error")
public void logAfterThrowingListMyTags(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.showMessagesWithTag(..))")
public void logBeforeShowMessagesWithTag(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.showMessagesWithTag(..))")
public void logAfterShowMessagesWithTag(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.showMessagesWithTag(..))", returning = "result")
public void logAfterReturningShowMessagesWithTag(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.showMessagesWithTag(..))", throwing = "error")
public void logAfterThrowingShowMessagesWithTag(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.subscribeUserToTag(..))")
public void logBeforeSubscribeUserToTag(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.subscribeUserToTag(..))")
public void logAfterSubscribeUserToTag(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.subscribeUserToTag(..))", returning = "result")
public void logAfterReturningSubscribeUserToTag(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.subscribeUserToTag(..))", throwing = "error")
public void logAfterThrowingSubscribeUserToTag(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.unsubscribeUserToTag(..))")
public void logBeforeUnsubscribeUserToTag(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.unsubscribeUserToTag(..))")
public void logAfterUnsubscribeUserToTag(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.unsubscribeUserToTag(..))", returning = "result")
public void logAfterReturningUnsubscribeUserToTag(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.MessageDAOImpl.unsubscribeUserToTag(..))", throwing = "error")
public void logAfterThrowingUnsubscribeUserToTag(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.save(..))")
public void logBeforeSaveCircle(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.save(..))")
public void logAfterSaveCircle(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.save(..))", returning = "result")
public void logAfterReturningSaveCircle(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.save(..))", throwing = "error")
public void logAfterThrowingSaveCircle(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.getAllCircles(..))")
public void logBeforeGetAllCircles(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.getAllCircles(..))")
public void logAfterGetAllCircles(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.getAllCircles(..))", returning = "result")
public void logAfterReturningGetAllCircles(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.getAllCircles(..))", throwing = "error")
public void logAfterThrowingGetAllCircles(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.getAllCircles(..))")
public void logBeforeGetAllCirclesWithString(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.getAllCircles(..))")
public void logAfterGetAllCirclesWithString(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.getAllCircles(..))", returning = "result")
public void logAfterReturningGetAllCirclesWithString(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.getAllCircles(..))", throwing = "error")
public void logAfterThrowingGetAllCirclesWithString(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

//Get Circle
@Before("execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.get(..))")
public void logBeforeGetCircle(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.get(..))")
public void logAfterGetCircle(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.get(..))", returning = "result")
public void logAfterReturningGetCircle(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.get(..))", throwing = "error")
public void logAfterThrowingGetCircle(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.update(..))")
public void logBeforeUpdateCircle(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.update(..))")
public void logAfterUpdateCircle(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.update(..))", returning = "result")
public void logAfterReturningUpdateCircle(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.update(..))", throwing = "error")
public void logAfterThrowingUpdateCircle(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}

@Before("execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.delete(..))")
public void logBeforeDeleteCircle(JoinPoint joinPoint) {

    logger.info("============@Before==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("*********************************");

}
@After("execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.delete(..))")
public void logAfterDeleteCircle(JoinPoint joinPoint) {

    logger.info("============@After==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterReturning(pointcut = "execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.delete(..))", returning = "result")
public void logAfterReturningDeleteCircle(JoinPoint joinPoint, Object result) {

    logger.debug("============@AfterReturning==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("*********************************");

}

@AfterThrowing(pointcut = "execution(* com.stackroute.activitystream.daoimpl.CircleDAOImpl.delete(..))", throwing = "error")
public void logAfterThrowingDeleteCircle(JoinPoint joinPoint, Throwable error) {

    logger.info("============@AfterThrowing==========");
    logger.debug("Method Name : " + joinPoint.getSignature().getName());
    logger.debug("Method arguments : " + Arrays.toString(joinPoint.getArgs()));
    logger.debug("Exception : " + error);
    logger.debug("*********************************");
}
}