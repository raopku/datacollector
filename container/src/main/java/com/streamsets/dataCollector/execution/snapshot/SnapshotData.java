/**
 * (c) 2015 StreamSets, Inc. All rights reserved. May not
 * be copied, modified, or distributed in whole or part without
 * written consent of StreamSets, Inc.
 */
package com.streamsets.dataCollector.execution.snapshot;

import com.streamsets.pipeline.runner.StageOutput;

import java.util.List;

public class SnapshotData {

  private final List<List<StageOutput>> snapshotBatches;

  public SnapshotData(List<List<StageOutput>> snapshotBatches) {
    this.snapshotBatches = snapshotBatches;
  }

  public List<List<StageOutput>> getSnapshotBatches() {
    return snapshotBatches;
  }
}