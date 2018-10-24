/**
 * 
 */
package org.bitcoinj.wallet;

import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.TestNet3Params;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.bitcoinj.core.*;
import org.bitcoinj.crypto.ChildNumber;
import org.bitcoinj.crypto.DeterministicHierarchy;
import org.bitcoinj.crypto.DeterministicKey;
import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.params.UnitTestParams;
import org.slf4j.LoggerFactory;
import org.spongycastle.crypto.params.KeyParameter;

import org.bitcoinj.core.listeners.DownloadProgressTracker;
import org.bitcoinj.core.*;
import org.bitcoinj.net.discovery.DnsDiscovery;
import org.bitcoinj.store.SPVBlockStore;
import org.bitcoinj.wallet.DeterministicSeed;
import org.bitcoinj.wallet.Wallet;

import java.io.File;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.List;


import com.google.common.base.Joiner;

/**
 * @author CRAZYPROGRAMMER
 *
 */
public class WalletCreation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NetworkParameters params = TestNet3Params.get();
		Wallet wallet = new Wallet(params);
		
		DeterministicSeed seed = wallet.getKeyChainSeed();
		String nmemonic = Joiner.on(" ").join(seed.getMnemonicCode());
		String seedCode = seed.toString();
		long creationTime = seed.getCreationTimeSeconds();
		
		System.out.println("Seed = " + seedCode);
		System.out.println("Seed creation time : " + creationTime);
		System.out.println("nmemonic = " + nmemonic);
	}

}
