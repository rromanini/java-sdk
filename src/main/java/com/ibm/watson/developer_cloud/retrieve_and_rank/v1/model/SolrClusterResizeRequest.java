/*
 * Copyright 2016 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ibm.watson.developer_cloud.retrieve_and_rank.v1.model;


import static com.ibm.watson.developer_cloud.retrieve_and_rank.v1.model.ApiConstants.*;

import com.google.gson.annotations.SerializedName;

/**
 * A value type for the JSON body provided when creating a Solr resize request.
 */
public class SolrClusterResizeRequest {

  @SerializedName(CLUSTER_SIZE)
  private final int clusterSize;

  /**
   * Instantiates a cluster resize request.
   *
   * @param clusterSize the desired cluster size
   */
  public SolrClusterResizeRequest(final int clusterSize) {
    this.clusterSize = clusterSize;
  }

  /**
   * Gets the cluster size.
   *
   * @return the cluster size
   */
  @SerializedName(CLUSTER_SIZE)
  public int getClusterSize() {
    return clusterSize;
  }

}
