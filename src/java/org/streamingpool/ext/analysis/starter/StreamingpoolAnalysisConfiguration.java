/**
 * Copyright (c) 2017 European Organisation for Nuclear Research (CERN), All Rights Reserved.
 */

package org.streamingpool.ext.analysis.starter;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.streamingpool.ext.analysis.conf.AnalysisConfiguration;
import org.streamingpool.ext.analysis.conf.AnalysisResolvingEngineConfiguration;
import org.streamingpool.ext.tensorics.conf.TensoricsStreamingConfiguration;

@Configuration
@Import({ AnalysisConfiguration.class, AnalysisResolvingEngineConfiguration.class,
        TensoricsStreamingConfiguration.class })
public class StreamingpoolAnalysisConfiguration {
    /* */
}
