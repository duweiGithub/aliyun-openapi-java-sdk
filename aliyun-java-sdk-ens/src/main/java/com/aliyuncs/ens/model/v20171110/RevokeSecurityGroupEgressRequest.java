/*
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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RevokeSecurityGroupEgressRequest extends RpcAcsRequest<RevokeSecurityGroupEgressResponse> {
	   

	private String sourcePortRange;

	private String securityGroupId;

	private String policy;

	private String portRange;

	private String ipProtocol;

	private Integer priority;

	private String version;

	private String destCidrIp;
	public RevokeSecurityGroupEgressRequest() {
		super("Ens", "2017-11-10", "RevokeSecurityGroupEgress", "ens");
		setMethod(MethodType.POST);
	}

	public String getSourcePortRange() {
		return this.sourcePortRange;
	}

	public void setSourcePortRange(String sourcePortRange) {
		this.sourcePortRange = sourcePortRange;
		if(sourcePortRange != null){
			putQueryParameter("SourcePortRange", sourcePortRange);
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putQueryParameter("Policy", policy);
		}
	}

	public String getPortRange() {
		return this.portRange;
	}

	public void setPortRange(String portRange) {
		this.portRange = portRange;
		if(portRange != null){
			putQueryParameter("PortRange", portRange);
		}
	}

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		if(ipProtocol != null){
			putQueryParameter("IpProtocol", ipProtocol);
		}
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	public String getDestCidrIp() {
		return this.destCidrIp;
	}

	public void setDestCidrIp(String destCidrIp) {
		this.destCidrIp = destCidrIp;
		if(destCidrIp != null){
			putQueryParameter("DestCidrIp", destCidrIp);
		}
	}

	@Override
	public Class<RevokeSecurityGroupEgressResponse> getResponseClass() {
		return RevokeSecurityGroupEgressResponse.class;
	}

}
