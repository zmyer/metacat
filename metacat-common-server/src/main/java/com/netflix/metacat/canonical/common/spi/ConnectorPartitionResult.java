/*
 *  Copyright 2016 Netflix, Inc.
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *         http://www.apache.org/licenses/LICENSE-2.0
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package com.netflix.metacat.canonical.common.spi;

import com.netflix.metacat.canonical.common.spi.util.TupleDomain;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * Result of fetching Partitions in the ConnectorSplitManager interface.
 * @author zhenl
 */
@Getter
@RequiredArgsConstructor
public class ConnectorPartitionResult {
    @NonNull
    private final List<ConnectorPartition> partitions;
    @NonNull
    private final TupleDomain<ColumnHandle> undeterminedTupleDomain;
}
