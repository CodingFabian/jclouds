/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.route53.predicates;

import static org.jclouds.route53.predicates.ZonePredicates.nameEquals;

import org.jclouds.route53.domain.Zone;
import org.testng.annotations.Test;

/**
 * 
 * @author Adrian Cole
 */
@Test(groups = "unit", testName = "ZonePredicatesTest")
public class ZonePredicatesTest {
   Zone zone = Zone.builder().id("EEEFFFEEE").callerReference("goog").name("jclouds.org.").build();

   @Test
   public void testNameEqualsWhenEqual() {
      assert nameEquals("jclouds.org.").apply(zone);
   }

   @Test
   public void testNameEqualsWhenNotEqual() {
      assert !nameEquals("kclouds.org.").apply(zone);
   }
}