/*
 * Copyright 2019-present Open Networking Foundation
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
package io.atomix.node.service;

import java.util.Collection;

/**
 * Service type registry.
 */
public interface ServiceTypeRegistry {

    /**
     * Returns the collection of registered service types.
     *
     * @return the collection of registered service types
     */
    Collection<PrimitiveStateMachine.Type> getServiceTypes();

    /**
     * Returns the service type for the given name.
     *
     * @param typeName the service type name
     * @return the service type
     */
    PrimitiveStateMachine.Type getServiceType(String typeName);

}