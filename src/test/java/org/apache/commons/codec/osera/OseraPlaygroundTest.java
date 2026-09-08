package org.apache.commons.codec.osera;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.codec.binary.Hex;
import org.junit.jupiter.api.Test;

/** Playground patch for the OSERA mistakes reference: a regression test only, no fix. The file has no licence header on purpose. */
public class OseraPlaygroundTest {
    @Test
    public void hexRoundTrip() throws Exception {
        assertEquals("6f73657261", Hex.encodeHexString("osera".getBytes("UTF-8")));
    }
}
