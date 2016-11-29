package org.fenixedu.academic;

import pt.ist.fenixframework.test.core.FenixFrameworkRunner;

import org.fenixedu.bennu.core.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Sérgio Silva (hello@fenixedu.org).
 */

@RunWith(FenixFrameworkRunner.class)
public class UsersTest {
    
    @Test
    public void simpleTest() {
        User user = new User("user1");
        Assert.assertEquals("user1", user.getUsername());
    }
}