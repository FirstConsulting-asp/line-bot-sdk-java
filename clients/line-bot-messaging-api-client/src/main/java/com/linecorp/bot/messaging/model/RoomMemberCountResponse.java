/*
 * Copyright 2023 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */
package com.linecorp.bot.messaging.model;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RoomMemberCountResponse
 *
 * @see <a href="https://developers.line.biz/en/reference/messaging-api/#get-members-room-count">
 *     Documentation</a>
 */
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record RoomMemberCountResponse(
    /**
     * The count of members in the multi-person chat. The number returned excludes the LINE Official
     * Account.
     */
    @JsonProperty("count") Integer count) {

  public static class Builder {
    private Integer count;

    public Builder(Integer count) {

      this.count = count;
    }

    public RoomMemberCountResponse build() {
      return new RoomMemberCountResponse(count);
    }
  }
}
