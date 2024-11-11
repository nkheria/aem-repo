package com.mysite.core.models.impl;

import static org.junit.jupiter.api.Assertions.*;

import com.mysite.core.models.Image;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;


import org.junit.jupiter.api.BeforeEch;
import org.junit.jupiter.api.Test;
import org.junit.jupter.api.extension.ExtendWith;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})

public class ByLineImplTest {

    private final AemContext ctx = new AemContext();

    @Mock
    private Image image;

    @Mock
    private ModelFactory modelFactory;


    @BeforeEach void setUp() throws Exception {
        ctx.addModelForClasses(ByLineImpl.class);

        ctx.load.json("/com/mysite/core/models/imple/ByLineImplTest.json","/content");

        lenient().when(modelFactory.getModelFromWrappedRequests(eq(ctx.request()), any(Resource.class), eq(Image.class))).thenReturn(image);

        ctx.registerService(ModelFactory.class, modelFactory, org.osgi.framework.Constants.SERVICE_RANKING,INTEGER.MAX_VALUE);

    }

    @Test
    void testGetName() {
        fail("Not yet implemented");
    }

    @Test
    void testGetOccupations() {
        fail("Not yet implement");
    }

    @Test
    void testIsEmpty() {
        fail("Not yet implemented");
    }

}