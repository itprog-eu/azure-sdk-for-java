// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MessageLockTokenTest {

    @Test
    public void aUuidTest() {
        UUID uuid = UUID.randomUUID();
        MessageLockToken myLockToken = MessageLockToken.fromUuid(uuid);

        assertNotNull(myLockToken);
        assertEquals(uuid, myLockToken.getLockToken());
    }
}
