/*
 * Copyright 2015-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.pcepio.protocol;

import java.util.LinkedList;

import org.jboss.netty.buffer.ChannelBuffer;
import org.onosproject.pcepio.exceptions.PcepParseException;

/**
 * Abstraction of an entity providing PCEP Initiate Message.
 */
public interface PcepInitiateMsg extends PcepObject, PcepMessage {

    @Override
    PcepVersion getVersion();

    @Override
    PcepType getType();

    /**
     * Returns list of PcInitiatedLspRequestList.
     *
     * @return list of PcInitiatedLspRequestList
     */
    LinkedList<PcInitiatedLspRequest> getPcInitiatedLspRequestList();

    /**
     * Sets list of PcInitiatedLspRequestList.
     *
     * @param llPcInitiatedLspRequestList list of PcInitiatedLspRequestList
     */
    void setPcInitiatedLspRequestList(LinkedList<PcInitiatedLspRequest> llPcInitiatedLspRequestList);

    @Override
    void writeTo(ChannelBuffer channelBuffer) throws PcepParseException;

    /**
     * Builder interface with get and set functions to build Initiate message.
     */
    interface Builder extends PcepMessage.Builder {

        @Override
        PcepInitiateMsg build();

        @Override
        PcepVersion getVersion();

        @Override
        PcepType getType();

        /**
         * Returns list of PcInitiatedLspRequestList.
         *
         * @return list of PcInitiatedLspRequestList
         */
        LinkedList<PcInitiatedLspRequest> getPcInitiatedLspRequestList();

        /**
         * Sets PcInitiatedLspRequestList.
         *
         * @param llPcInitiatedLspRequestList list of PcInitiatedLspRequestList
         * @return builder by setting list of PcInitiatedLspRequestList
         */
        Builder setPcInitiatedLspRequestList(LinkedList<PcInitiatedLspRequest> llPcInitiatedLspRequestList);
    }
}
