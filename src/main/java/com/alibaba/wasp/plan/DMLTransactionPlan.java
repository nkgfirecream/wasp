/**
 * Copyright 2010 The Apache Software Foundation
 *
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
package com.alibaba.wasp.plan;

import com.alibaba.wasp.plan.action.TransactionAction;

import java.util.List;

/**
 *
 * 
 */
public class DMLTransactionPlan extends DMLPlan {

  private List<TransactionAction> actions;

  public DMLTransactionPlan(List<TransactionAction> actions) {
    this.actions = actions;
  }

  @Override
  public List<TransactionAction> getActions() {
    return actions;
  }

  public void setActions(List<TransactionAction> actions) {
    this.actions = actions;
  }

  /**
   * @see Object#toString()
   */
  @Override
  public String toString() {
    return "TransactionDMLPlan [actions=" + actions + "]";
  }
}