package io.kestra.mcp;

import io.kestra.core.mcp.models.McpServer;

/**
 * Supplies the tools exposed by every MCP server of one {@link McpServer.ToolSource} kind, which an
 * implementation declares by being {@code @Named} after it.
 * <p>
 * The transport, sessions and endpoint are shared by every kind: a source only decides which tools a caller
 * sees on a server, and how callers that see the same tools are grouped so they share one built server.
 */
public interface McpToolSource {
    /**
     * Resolves what the caller behind this context sees. Called once per request, while the caller is known.
     */
    McpToolView view(KestraMcpTransportContext context);
}
