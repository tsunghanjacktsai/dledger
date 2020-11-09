/*
 * Copyright 2017-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.openmessaging.storage.dledger.exception;

import io.openmessaging.storage.dledger.protocol.DLedgerResponseCode;

public class DLedgerException extends RuntimeException {

    private final DLedgerResponseCode code;

    public DLedgerException(DLedgerResponseCode code, String message) {
        super(message);
        this.code = code;
    }

    public DLedgerException(DLedgerResponseCode code, String format, Object... args) {
        super(String.format(format, args));
        this.code = code;
    }

    public DLedgerResponseCode getCode() {
        return code;
    }
}
