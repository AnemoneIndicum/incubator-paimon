/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.paimon.flink.copy;

import javax.annotation.Nullable;

/** The information of copy file. */
public class CopyFileInfo {
    @Nullable private final String sourceFilePath;
    @Nullable private final String filePathExcludeTableRoot;
    private final String sourceIdentifier;
    private final String targetIdentifier;

    public CopyFileInfo(
            @Nullable String sourceFilePath,
            @Nullable String filePathExcludeTableRoot,
            String sourceIdentifier,
            String targetIdentifier) {
        this.sourceFilePath = sourceFilePath;
        this.filePathExcludeTableRoot = filePathExcludeTableRoot;
        this.sourceIdentifier = sourceIdentifier;
        this.targetIdentifier = targetIdentifier;
    }

    @Nullable
    public String getSourceFilePath() {
        return sourceFilePath;
    }

    @Nullable
    public String getFilePathExcludeTableRoot() {
        return filePathExcludeTableRoot;
    }

    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    public String getTargetIdentifier() {
        return targetIdentifier;
    }

    @Override
    public String toString() {
        return String.format(
                "{ sourceFilePath: %s, filePathExcludeTableRoot: %s, sourceIdentifier: %s, targetIdentifier: %s}",
                sourceFilePath, filePathExcludeTableRoot, sourceIdentifier, targetIdentifier);
    }
}
