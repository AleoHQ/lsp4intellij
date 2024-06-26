/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.lsp4intellij.listeners;

import com.intellij.openapi.editor.event.DocumentEvent;
import com.intellij.openapi.editor.event.DocumentListener;
import org.jetbrains.annotations.NotNull;

public class DocumentListenerImpl extends LSPListener implements DocumentListener {

    /**
     * Called before the text of the document is changed.
     *
     * @param event the event containing the information about the change.
     */
    @Override
    public void beforeDocumentChange(@NotNull DocumentEvent event) {
    }

    /**
     * Called after the text of the document has been changed.
     *
     * @param event the event containing the information about the change.
     */
    @Override
    public void documentChanged(@NotNull DocumentEvent event) {
        if (checkEnabled()) {
            manager.documentChanged(event);
        }
    }
}
