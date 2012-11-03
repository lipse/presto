/*
 * Copyright 2004-present Facebook. All Rights Reserved.
 */
package com.facebook.presto.nblock.uncompressed;

import com.facebook.presto.nblock.AbstractTestBlockCursor;
import com.facebook.presto.nblock.Block;
import org.testng.annotations.Test;

import static com.facebook.presto.nblock.BlockAssertions.createDoublesBlock;
import static io.airlift.testing.Assertions.assertInstanceOf;

public class TestUncompressedDoubleBlockCursor extends AbstractTestBlockCursor
{
    @Override
    protected Block createExpectedValues()
    {
        return createDoublesBlock(0, 11.11, 11.11, 11.11, 22.22, 22.22, 22.22, 22.22, 22.22, 33.33, 33.33, 44.44);
    }

    @Test
    public void testCursorType()
    {
        assertInstanceOf(createExpectedValues().cursor(), UncompressedDoubleBlockCursor.class);
    }
}