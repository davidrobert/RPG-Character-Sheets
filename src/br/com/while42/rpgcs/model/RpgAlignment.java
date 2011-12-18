package br.com.while42.rpgcs.model;

import android.content.Context;
import br.com.while42.rpgcs.R;

public enum RpgAlignment {
		
	LAWFUL_GOOD {
		public String toString(Context ctx) {
			return ctx.getString(R.string.lawful_good);
		}
	},
	NEUTRAL_GOOD{
		public String toString(Context ctx) {
			return ctx.getString(R.string.neutral_good);
		}
	},
	CHAOTIC_GOOD{
		public String toString(Context ctx) {
			return ctx.getString(R.string.chaotic_good);
		}
	},
	LAWFUL_NEUTRAL{
		public String toString(Context ctx) {
			return ctx.getString(R.string.lawful_neutral);
		}
	},

	TRUE_NEUTRAL{
		public String toString(Context ctx) {
			return ctx.getString(R.string.true_neutral);
		}
	},
	CHAOTIC_NEUTRAL{
		public String toString(Context ctx) {
			return ctx.getString(R.string.chaotic_neutral);
		}
	},

	LAWFUL_EVIL{
		public String toString(Context ctx) {
			return ctx.getString(R.string.lawful_evil);
		}
	},
	NEUTRAL_EVIL{
		public String toString(Context ctx) {
			return ctx.getString(R.string.neutral_evil);
		}
	},
	CHAOTIC_EVIAL{
		public String toString(Context ctx) {
			return ctx.getString(R.string.chaotic_evil);
		}
	};
}
